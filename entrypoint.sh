#!/usr/bin/env sh

mvnw clean package

exec "$@"
