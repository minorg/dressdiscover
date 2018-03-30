#!/bin/bash
docker rm dressdiscover
docker rmi dressdiscover:latest
docker build . -t dressdiscover:latest
