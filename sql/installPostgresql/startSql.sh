#!/bin/bash

softPath="$(pwd)"

echo 'export PATH="$softPath/postgresql/bin:$PATH"' >> ~/.bash_profile && source ~/.bash_profile

export PATH="$softPath/postgresql/bin:$PATH"


export LD_LIBRARY_PATH=$softPath/postgresql/lib/

echo "Execute psql here (ex psql template1 the first time)"

/bin/bash
