	Udemy -	Understanding Docker and using it for Selenium automation

1.Introduction: {
  1.1.What is Docker? {
    + In a nutshell, it's a software containerization platform. It provides abstraction of OS level virtualization.
    + In high level: These containers contain the real:
      * Operating System
      * Software that you build
      * Dependencies to run the software (like pre-requisite softwares)
      * Environment variables
      * And you name it
  }
  1.2.So these containers are VM image, right? NOOOO {
    + Virtual Machines:
      * Infrastructure, Host OS, Hypervisor, GUEST OS, Bins/Libs, App -> all amount to tens of GBs
    + Containers:
      * Infrastructure, Host OS, Docker Engine,        Bin/Libs, App,
      * Share the kernel with other containers, running as isolated processes in user space on the host OS. Docker containers are not tied to any specific infrastructure: they run on any computer, on any infrastructure, and in any cloud.
  }
  1.3.How Docker achieved containers? {
    + It was made possible with the help of LXCs (Linux containers)
    + LXCs are 'user space' interface for the Linux kernel containment which makes it possible to run multiple isolated Linux containers, on one control host (the LXC host)
    + Linux Containers serve as a lightweight alternative to VMs as they don't require the hypervisors like:
      * Virtualbox,
      * KVM,
      * Xen etc.
  }
  1.4.As that said, Docker now is our solution for the problem: {
    + Runs in your machine but not in mine
  }
  1.5.That's why Docker call themselves: {
    + BUILD -> SHIP -> RUN
  }
  1.6.What's the Roadmap of this course? {
    + Understand the basic of Docker
    + Use docker for Selenium automation testing in multiple containers (machines)
    + Create our very own container for automation/development.
  }
}
