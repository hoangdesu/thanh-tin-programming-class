[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=19307565&assignment_repo_type=AssignmentRepo)
#  Java Programming Studio Workshop 4 Starter Code
Starter code for Workshop 4 on JDBC. This is your first look at a "bigger project" that has multiple Java files. It also uses a "simple" configuration & build system in the Maven format. This helps make sure we can configure our "big software project" so that everyone can use it.
This example uses the Movies database from the Week 04 SQL exercises.

Folders:
```bash
├── /src/main                    - Location of all files as required by build configuration
│         ├── java               - Java Source location
│         │    └── app           - package location for all Java files
│ 
├── /database                    - The folder to store sqlite database files (*.db files)
├── README.md                    - This file ;)
|
├── pom.xml                      - Configure Build (DO NOT MODIFY)
└── /target                      - build directory (DO NOT MODIFY)
```

Libraries:
* org.xerial.sqlite-jdbc (SQLite JDBC library)

# Building & Running the code
1. Open this project within VSCode
2. Allow VSCode to read the pom.xml file
 - Allow the popups to run and "say yes" to VSCode configuring the build
 - Allow VSCode to download the required Java libraries
3. To Build & Run
 - Open the src/main/java/app/App.java source file, and select "Run" from the pop-up above the main function

# Important Notes
1. ONLY modify the files which you are allowed to edit. The other files are placed in important places to make our "big software project" work.
2. DO NOT move the Java files from the ```src/main/java/app``` folder. These Java files need to be in this location to ensure our "big software project" works.

# DEV Container for GitHub Codespaces
The ```.devcontainer``` folder contains configuration files for GitHub Codespaces.
This ensures that when the GitHub classroom is cloned, the workspace is correctly configured for Java (V16) and with the required VSCode extensions.
This folder will not affect a *local* VSCode setup on a computer.

**🚨 DO NOT MODIFY THE CONTENTS OF THIS FOLDER. 🚨**

# Authors
* Java Programming Studio teaching team, School of Science and Technologies, RMIT Vietnam.
* Dr. Timothy Wiley, School of Computing Technologies, STEM College, RMIT University.
* Prof. Santha Sumanasekara, School of Computing Technologies, STEM College, RMIT University.

Copyright RMIT University (c) 2025
