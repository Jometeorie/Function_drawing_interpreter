import matplotlib.pyplot as plt
import argparse
import os
import seaborn as sns

def  draw_sctter(ax, dots_list, color, dot_size):
    print(color)
    # 绘制散点
    for dot in dots_list:
        ax.scatter(dot[0], dot[1], color = color, marker = '.', s = dot_size)

def transfer_str_to_list(dots_list_str):
    # 将字符串列表(['0#0', '1#1', '2#2']转为list[[0, 0], [1, 1], [2, 2]])
    dots_list  = []
    for dots in dots_list_str:
        dot = [float(dots.split('#')[0]), float(dots.split('#')[1])]
        dots_list.append(dot)
    return dots_list

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('--output_path', type = str, required = True)
    parser.add_argument('--UI_style', type = str, required = True, 
            choices = ['darkgrid', 'whitegrid', 'dark', 'white', 'ticks'])
    args = parser.parse_args()

    sns.set_style(args.UI_style)

    # 创建绘图UI
    fig = plt.figure()
    ax = fig.add_subplot(1, 1, 1)

    # 依次读取需要绘制的参数文件，并绘制图形
    for param_file in os.listdir(args.output_path):
        file = open(args.output_path + param_file)
        content = file.read()
        file.close()

        Color1, Color2, Color3 = map(float, content.split('\n')[0].split('#'))
        Dot_Size = float(content.split('\n')[1])
        Dots_List =transfer_str_to_list(content.split('\n')[2 : ])

        # 绘制该参数文件中的点坐标
        draw_sctter(ax, Dots_List, (Color1, Color2, Color3), Dot_Size)
    
    plt.show()