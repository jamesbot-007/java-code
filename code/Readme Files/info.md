First created a simple java container by copying current directory files only one java file (hello world ile) to test java is working or not.

successfully work.

## bind mount  point     --------(*)
mount current directory to container
but container size so much increase 700MB

## decide to use online repository(storage) use github repository
add git docker image
RUN git clone command
 ok good. evertying is done.

Problem : Everytime before deleting container i need commit changes and push code on github otherwise changes will also deleted with container

Solution : created a docker volume and put all github repositories code their and access from it.
not don't need to make extra unnecessary commits. After changes made, can delete container and changes stored in volume. 

Good 👍

But again problem : The chnages not reflect on my local everytime need to connnect with github repository.
another things is everytime need internet connectivity.



The thing is either we can take code from local to container or github to container. we can not check like where changes made after last commit and take from it. 

if local then bind volume mount to local
if github then pull code from it 
But we can not do like that

Solution : bind mount --------(*)
Yaah it has big size as compare to connect with remote repository. but if we can afford it then we must choose it.

because on both side In container and in local we're on same track no need to do anything before start coding on each. we do not need to clone latest changes.
But if we use remote repository connection then if we switch from local to container OR visaversa then we need to clone github repo. and then we can start coding


One more thing is it is stupide thing if you have local setup then why you use docker.may be for different version. but if we think like that then connect with remote repositories is best idea. 

If we see only storege/space the image takes then,
bind volume takes : 730 mb
remote connection takes : 350 mb ( less than half of bind volume)

> In today's world USER want convinience( and speed) it don't care about storage (and money )

---
---

Let's create docker-compose.yml for bind volume .


The compose file is created on basis of docker run command in our case it is `docker run -d --name java-dev-env3 -v "D:\Code Playground\12_Java\Java Tutorial:/app/" doc_java`

This type of things we can done by AI. and the result will be,
```yml
version: "3.8"
services:
  java-dev-env3:
    image: doc_java
    container_name: java-dev-env3
    volumes:
      - "D:/Code Playground/12_Java/Java Tutorial:/app"
    stdin_open: true
    tty: true

```

docker compose up -d

OR right click on docker-compose.yml -> compose up



---
---

create .devcontainer