How to Do and Submit Your Works
==============================
## A Short Guide with Tips on Completing COM 118-119 assignments from the TAs

This guide warns students of common mistakes and formalizes the submission format and the checking process.

## Submitting Assignments to Canvas

After receiving the assignment on Canvas, please *carefully* read the task description with instructions on Canvas and other sites from all the associated links. Then, after completing your work on the code, follow these steps:

1. Open your **GitHub Classroom** repository.

2. Click on the short ID of your last commit.

![Short Commit ID](https://i.imgur.com/39ordAu.jpg)

3. Copy the full commit ID from the following page without any additional spaces or characters and nothing else.

![Full Commit ID](https://i.imgur.com/VEftvkO.jpg) 

4. Paste the commit ID into the submission field on Canvas. Ensure you have `p > span` or `p` written at the bottom of the form.

![Canvas Submission Form](https://i.imgur.com/hU85xUN.jpg)

5. Make sure there are no additional lines of text, empty spaces, tabs, or newline characters. Paste only one commit ID. DO NOT paste multiple commit IDs into the submission field!

6. Proceed by submitting the assignment.

7. You may resubmit the commit ID an unlimited number of times before the deadline. Submit only one commit ID each time, though. The new submission will replace the old one.

### How Do We Obtain Your Works

Canvas exports your submission as HTML files, and our scripts extract the commit IDs from these files. Then, your hashes are used to get the correct version of your work.

The scripts may break if you leave anything in the submission field except the final commit ID. Your submission will not be graded in such a case. You will receive zero for the work no matter what code you have in your GitHub repository.

### How URI Tasks are Graded

We grade URI tasks by submitting your code to the Beecrowd in an automatic way. Therefore, please ensure that you have your task files in the folder **with the correct names**! The URI submission will not be graded if a file is named incorrectly. All grades on URI tasks are final because they are calculated from Beecrowd results directly. Your accounts are not used when checking the submission.

### How Labs are Graded

Labs are graded by an automated script with TA as a supervisor. It is important to have **exactly the same** output as described and shown in the Lab specification. ***Different output may result in getting 0 for specified task***. 

### About Specification

The description of the task is comprehensive and all tasks are checked against it. Therefore, you *have to read the description carefully*. If description gives multiple variations of behaviour (2 or more different cases of input/output) your program has to support **all** of them, even if there is only one example of the input/output.

### Implementation Details

Tasks, which tell you to implement code in a certain way, are code-checked manually. If task says that you need write code using special function or in a certain style - that means it is **required**. Your implementation would be checked. If you fail to follow the requirement, the task will be graded with 0.

### Formatting Issues

This time policy regarding the output format of your lab tasks became harsher. Please follow the specified output format. Any cases of different outputs now will be considered as an error and will result in getting 0 for the specified problem. Note: tasks with undertmined output (random numbers, time related outputs, etc.) are not falling into this category. Differences in the time/random value are not considered.

### Cheating

All code tasks are checked against all students. This means that similar code samples would be detected automatically. Further audit would be done manually by TA. **Lowering case, changing variable/function/class names, order of variables/functions, or any other trick would not work**. The code checking id done in absolute way, as well as semantically, logically. 

## Tips to Solve Common Issues

This section will be updated frequently to add more useful tips.

### Git

1. Merge error (without merge conflicts)
 
 If you worked on multiple machines and have created and pushed commits on them, without fetching changes, you may encounter merge error. 
 
 **Solution**: IntelliJ IDEA would suggest you to perform merge - do this, usually it is safe, when working on small codebases.

 **How to prevent**: to prevent the merge error update your repository as frequently as possible. You can use [this tutorial](https://www.jetbrains.com/idea/guide/tutorials/creating-a-project-from-github/git-fetch/) to discover how to fetch updates.

2. Merge error (with conflicts)

 If you changed the single file with two separate commits and forgot to fetch changes, you will encounter the merge conflict.

 **Soultion**: sometimes resolving conflicts is hard, and it can not be done automatically. You can revert your changes and delete the commit, update repository and redo the work. If you want to resolve conflicts anyway follow [this](https://www.jetbrains.com/idea/guide/tips/resolve-merge-conflicts/) and [this](https://www.jetbrains.com/help/idea/resolve-conflicts.html) tutorial. This process can be hard and I recommend you to read about git conflicts [here](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts).

 **How to prevent**: update your repository with git fetch, if you work using multiple machines.

3. Cloning error in the IntelliJ (Authentication failed)

 If you use an old Github access token from last semester, you may encounter an authentication error

 **Solution**: remove an old token from IntelliJ. Then add repository with new project again using VCS option - when dialog for Github authentication will pop up, select the Personal Access Token authorization and generate a new token. This will give IntelliJ Access to the new repository.

### Java

1. Wrong class name

 If you created the file using non-standard method you will encounter this error due to difference of class and file names. In java class has to have the same name as the file.

 **Solution**: rename the class or file to the same name

2. Index out of range 

 Cause: probably you messed up with the array indexing - it has size of *n* and you use an element with index *n+1* or bigger. Or it can be a negative index. Debugging may show what is the value of the breaking index.

 **Solution**: think about the access constraints. This error usually happens when the index is dynamic, so you better to check if this dynamic index is in bounds of the array size. **Just add additional checks and constraints to the code which accesses the array**

3. Presentation error/Wrong answer on URI (newline related)

 You wrote code and it does not pass. Try this first.

 Issue: the printing statements are either `print` or `printf` without the `%n` in the end. The new line is a big thing in the text formatting, and its absence is usually is considered as a mistake.

 **Solution**: watch carefully for `%n` newline symbols in your code, if you use `printf` and try to minimise the usage of `print`