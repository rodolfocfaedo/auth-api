#!/usr/bin/env bash

set -euo pipefail

cd "$(dirname "$0")/.."

if [[ ! -f .env ]]; then
  echo "ERROR: .env file not found. Create it with: cp .env.example .env" >&2
  exit 1
fi

set -a
source .env
set +a

exec ./gradlew bootRun
