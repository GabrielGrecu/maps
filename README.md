"""
# Eight Queens Problem Solver

A Java program to solve the Eight Queens problem, inspired by the investigation done by Carl Friedrich Gauss in 1850. The challenge entails placing eight queens on a standard 8x8 chessboard in such a way that no two queens threaten each other, meaning no two queens share the same row, column, or diagonal.

## Overview

This project implements a backtracking algorithm to find solutions to the Eight Queens problem. The program explores all possible queen placements on the chessboard recursively, ensuring that each placement is valid and does not lead to any queen threats.

## Java Implementation

The `EightQueens` class contains methods to solve the problem and display the solutions. The program finds all possible solutions and prints them out. 

## Dockerization

Included is a Dockerfile to facilitate the deployment of the program. The Dockerfile sets up the environment using OpenJDK 11, compiles the Java source code, and runs the program inside a Docker container.

## Usage

https://hub.docker.com/repository/docker/alexandrugabrielgrecu/chess/general
To run the program locally, ensure you have Docker installed and execute the following commands:

```bash
docker pull alexandrugabrielgrecu/chess
docker run alexandrugabrielgrecu/chess

## Resources
GeeksforGeeks - 8 Queen Problem
http://www.datagenetics.com/blog/august42012/
https://medium.com/cracking-the-coding-interview-in-ruby-python-and/8-12-the-8-queens-problem-with-solutions-ruby-javascript-and-python-409cea33b5b3

## Credits
This project draws inspiration from various online resources and aims to provide a practical implementation of the Eight Queens problem using Java and Docker.
