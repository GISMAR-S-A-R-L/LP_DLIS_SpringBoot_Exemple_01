# LP_DLIS_SpringBoot_Exemple_01

## Dockerization 

### Build docker image
```bash
docker build -t springboot_exemple_01:latest .
```
### Check build
```bash
docker images
```

### Run docker image
```bash
docker run -p 8081:8080 springboot_exemple_01
```

### Lanceur le browser
http://localhost:8081/
