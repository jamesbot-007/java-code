create .vscode folder 
`tasks.json` file inside it.

.vscode is specially used for vscode regarding configurations

task.json to compile and run java program
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Compile Java",
      "type": "shell",
      "command": "javac",
      "args": [
        "-d",
        "out",
        "${file}"
      ],
      "group": {
        "kind": "build",
        "isDefault": true
      },
      "problemMatcher": {
        "owner": "java",
        "fileLocation": [
          "relative",
          "${workspaceFolder}"
        ],
        "pattern": [
          {
            "regexp": "^(.*\\.java):(\\d+): (.*)$",
            "file": 1,
            "line": 2,
            "message": 3
          }
        ]
      }
    },
    {
      "label": "Run Java",
      "type": "shell",
      "command": "java",
      "args": [
        "-cp",
        "out",
        "${fileBasenameNoExtension}"
      ],
      "group": {
        "kind": "test",
        "isDefault": true
      },
      "dependsOn": "Compile Java"
    },
    {
      "type": "java (buildArtifact)",
      "targetPath": "${workspaceFolder}/${workspaceFolderBasename}.jar",
      "elements": [
        "${compileOutput}",
        "${dependencies}"
      ],
      "problemMatcher": [],
      "label": "java (buildArtifact): Java Tutorial",
      "group": {
        "kind": "build",
        "isDefault": true
      }
    }
  ]
}
```


To run it we can do
ctrl+shift+p -> task run -> run java

For faster access you can assign keyboard shortcur in keybinding.json file i.e. keyboard shortcur json file
```json
{
    "key": "ctrl+alt+r", // Shortcut for Run Java
    "command": "workbench.action.tasks.runTask",
    "args": "Run Java" // Task label
},
```

> Tasks can be any command to run. This way we can increse our speed by assigning big commands a name and run it using that name. 
> use special variables like ${file} and make your work more faster
---
---

Another method is,
Configure code runner commands

edit settings.json file
```json
"code-runner.executorMap": {
    // "javascript": "node",
    // "python": "python3 -u",
    "java": "cd $dir && javac -d out $fileName && java -cp out $fileNameWithoutExt",
    // "c": "gcc $fileName -o $fileNameWithoutExt && $dir/$fileNameWithoutExt",
    // "cpp": "g++ $fileName -o $fileNameWithoutExt && $dir/$fileNameWithoutExt"
},
```
Running code via Code Runner is faster as compare to via tasks. 
---
---

setup for sublime text edior is also same as this 