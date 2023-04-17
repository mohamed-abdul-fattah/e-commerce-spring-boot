#!/usr/bin/env sh

mvnw clean verify

exec "$@"
