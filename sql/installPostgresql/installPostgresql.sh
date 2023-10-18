#!/bin/bash

## https://gist.github.com/yunpengn/832aceac6998e2f894e5780229920cb5

softPath="$(pwd)"

mkdir -p $softPath/postgresql
mkdir -p $softPath/data

wget https://ftp.postgresql.org/pub/source/v12.1/postgresql-12.1.tar.gz
tar xvzf postgresql-12.1.tar.gz
cd postgresql-12.1

./configure --prefix=$softPath/postgresql --with-python PYTHON=/usr/bin/python3 --without-readline

make world -j 8
make install-world


echo 'export PATH="$softPath/postgresql/bin:$PATH"' >> ~/.bash_profile && source ~/.bash_profile

initdb -D $softPath/data

cd $softPath
rm postgresql-12.1 -r
rm postgresql-12.1.tar.gz

