# ESOF 322 - Software Engineering

This is the base upstream repository for ESOF 322.  It will be used for code-related homework and general
 exploration in the class.

## Getting Your Private Copy (Clone)

For the project leader, please follow these instructions

- Create a *private* repository in your own account by
    - Going to <https://github.com/new>
    - Enter the name `esof-322-spring2025-private`
    - Select `Private`
    - **DO NOT ADD A README.MD or .gitignore!**
    - Navigate to the `Settings` -> `Manage Access` section
    - Add `1cg` as a collaborator

Once your repository is initialized, you can clone it to your local machine using the instructions provided by
github.  (We recommend using the command line, install `git` on windows and use `gitbash` if you have not done so)

Next, you should add the class repository as an upstream git repo:

```bash
$ git remote add upstream https://github.com/msu/esof-322-spring2025.git
$ git pull upstream main
$ git push
```
This will synchronize your private repository with the class repository.

When you want to get an update from the public class repository you can run this command:

```
$ git pull upstream main
```
