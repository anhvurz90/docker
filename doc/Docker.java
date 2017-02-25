- Learn Docker in 12 Minutes: {
	+ https://www.youtube.com/watch?v=YFl2mCHdv24
	+ Docker: { 
		1.Same environment
		2.Sandbox Projects
		3.It just works!
	}
	+ Containers: {
		* Virtual Machines: {
			App		App		|
			bins/libs	bins/libs	| VM
			kernel	kernel	|
			Hypevisor
			Host OS
			Server
		}
		* Container: {
			App		App		|
			bins/libs	bins/libs	| docker
			Host OS
			Server
		}
	}
	+ Image: {
		* Runs in a Container
		* contains: OS, Software, Application Code
	}
	+ Dockerfile: {
		* built -> image
	}
	+ Install Docker for Ubuntu: {
		* https://docs.docker.com/engine/installation/linux/ubuntu/
		* https://apt.dockerproject.org/repo/pool/main/d/docker-engine/
		* docker-engine_1.13.1-0~ubuntu-trusty_amd64.deb:
			https://apt.dockerproject.org/repo/pool/main/d/docker-engine/docker-engine_1.13.1-0~ubuntu-trusty_amd64.deb
		* sudo dpkg -i docker-engine_1.13.1-0~ubuntu-trusty_amd64.deb
		* sudo docker run hello-world
		* https://docs.docker.com/engine/installation/linux/linux-postinstall/
		
		* Uninstall:
			- sudo apt-get purge docker-engine
			- sudo rm -rf /var/lib/docker
	}
	+ First dockerfile: {
		* hub.docker.com/search
		* index.php: {
			<?php
			echo "Hello, World";
		}
		* Dockerfile: {
			FROM php:7.0-apache
			COPY src /var/www/html
			EXPOSE 80
		}
		* docker build -t hello-world .
		* docker run -p 80:80 hello-world 
		* docker run -p 80:80 -v /Users/jake/Desktop/docker/src/:/var/www/html/ hello-world
		 -> browser:localhost
	}
}
- Introduction to Docker:  {
	+ https://www.youtube.com/watch?v=Q5POuMHxW-0
	+ docker ps
	+ docker run
	+ docker images
	+ docker images ubuntu
	+ docker run -i -t ubuntu:12.10 /bin/bash
		exit
	+ ssh dockerdev
	+ docker ps
	+ docker diff {id}
	+ docker commit {id} shykes/broken-ubuntu
	+ docker images | grep broken
	+ docker run -i -t shykes/broken-ubuntu bash
	+ docker push shykes/broken-ubuntu
	+ https://index.docker.io
		-> search for: 'broken-ubuntu'
	+ docker run -p 8080 -i -t ubuntu bash
	+ apt-get install netcat
	+ nc -l  8080
	+ docker diff {id}
	+ ps faxw
}