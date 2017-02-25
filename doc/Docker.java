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