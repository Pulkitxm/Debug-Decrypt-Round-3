#!/bin/bash

for i in {1..8}; do
	mkdir -p "encoder-code-$i"
	touch "encoder-code-$i/Main.java"
	touch "encoder-code-$i/main.py"
	touch "encoder-code-$i/main.cpp"
done
