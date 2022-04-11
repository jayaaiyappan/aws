#! /usr/bin/bash

if ! grep aws_access_key_id ~/.aws/config; then
   if ! grep aws_access_key_id ~/.aws/credentials; then
   echo "AWS config not found or you don't have AWS CLI installed"
   exit 1
   else
    echo "config found"
   fi
else
   echo "file exist"
fi