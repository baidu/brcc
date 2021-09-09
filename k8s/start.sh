#! /bin/bash
kubectl apply -f brcc-namespace.yaml
kubectl apply -f brcc-config.yaml
kubectl apply -f brcc-server.yaml
kubectl apply -f brcc-service.yaml

