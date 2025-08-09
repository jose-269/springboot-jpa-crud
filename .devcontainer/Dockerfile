FROM mcr.microsoft.com/devcontainers/java:17
RUN apt-get update && apt-get install -y maven
RUN apt-get update && \
    apt-get install -y iputils-ping curl netcat-openbsd && \
    rm -rf /var/lib/apt/lists/*
