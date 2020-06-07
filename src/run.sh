#!/bin/bash
java org.antlr.v4.Tool tools/DrawGraph.g4
javac *.java
java Draw ../test/test.txt
