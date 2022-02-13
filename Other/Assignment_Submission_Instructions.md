How to Do and Submit Your Works
===============================
# A Short Guide with Tips on Completing COM 118-119 assignments from the TAs

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

8. Please, do not post any comments for your submissions unless you want to reply to the TA. We ignore all comments that are not responses. We may even give you zero for disturbing the TA from their work with unnecessary notifications.

## How Do We Obtain Your Works

Canvas exports your submission as HTML files, and our scripts extract the commit IDs from these files. Then, your hashes are used to get the correct version of your work.

The scripts may break if you leave anything in the submission field except the final commit ID. Your submission will not be graded in such a case. You will receive zero for the work no matter what code you have in your GitHub repository.

## How URI Tasks are Graded

We grade URI tasks by submitting your code to the Beecrowd in an automatic way. Therefore, please ensure that you have your task files in the folder **with the correct names**! The URI submission will not be graded if a file is misnamed. All grades on URI tasks are final because they are calculated from Beecrowd results directly. Your accounts are not used to check the submissions.

## How Labs are Graded

An automated script grades labs. The TA supervises the process. Therefore, it is crucial to have **precisely the same** output as described and shown in the Lab specification. **Different output will result in zero for the specified task**.

## The Importance of Specifications

We try to keep the task descriptions comprehensive. We check your solutions against them. Therefore, you *have to read the requirement documents carefully*. If some document lists multiple variations of the program behavior, your program has to support **all** of them, even if there is only one example of the input/output provided.

If you believe the requirement documents are incomplete, ask the TA or the professor to clarify them. You will get zero if you do not do that and proceed with your assumptions of how the program should behave.

In some instances, the requirement document will miss the info discussed during the class. Follow the spec from the class recording in such a case.

Sometimes, the requirements from the spec will be different from what was discussed during the class. The requirement document is the last source of truth. Follow it in such a case. It has priority over the class discussions.

## The Importance of Implementation Details

Tasks, which tell you to implement code in a certain way, are checked manually by the TA. If the problem says that you need to use a special function or write the code in a particular style — that means it is **required** to do so in your sources. If you fail to follow the requirement, the task will be graded with zero.

## The Importance of Output Formatting

Follow the specified output format outlined in the requirements. One different character, lack of a newline sequence, or an incorrect letter case in your output will result in a zero for your work. Note that tasks with undetermined output (random numbers, time-related values, etc.) are not falling into this category. Output with such elements will be checked in a special by our scripts.

## The Importance of NOT Cheating

All code tasks are checked against the other students' code and code from students from previous semesters. Similar code samples would be detected automatically. TAs do manual checks too. The code checking is done with simple pattern matching first and complex semantical and logical analyses next. It means that **lowering case, changing variable/function/class names, order of variables/functions, or using any other common trick** will not work. If it is not the first time you are caught cheating, we will consider giving you F for the course and reporting you to the Registrar's office.

## Tips to Solve Common Issues

Here we will add some recommendations to fight problems that most students encounter throughout the course work. This section will be updated frequently to add more valuable tips.

### Git Tips

1. Merge Errors (without Merge Conflicts)

    If you have worked on multiple machines and created and pushed commits from them, you may encounter merge errors.

    **Solution**: IntelliJ IDEA would suggest you perform merge — do this; usually, it is safe when working on small codebases.

    **How to prevent**: to prevent the merge error update your repository as frequently as possible. You can use [this tutorial](https://www.jetbrains.com/idea/guide/tutorials/creating-a-project-from-github/git-fetch/) to discover how to fetch updates.

2. Merge Error (with Merge Conflicts)

    If you have changed one file with two separate commits and forgot to fetch changes, you will encounter the merge conflict.

    **Soultion**: sometimes, resolving conflicts is hard, and it can not be done automatically. You can revert your changes, delete the commit, update the repository, and redo the work. If you want to resolve the conflicts anyway, follow [this](https://www.jetbrains.com/idea/guide/tips/resolve-merge-conflicts/) and [this](https://www.jetbrains.com/help/idea/resolve-conflicts.html) tutorial. This process can be complex. I recommend you to read more about Git conflicts [here](https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts).

    **How to prevent**: regularly update your repository if you work on multiple machines. You can use [this tutorial](https://www.jetbrains.com/idea/guide/tutorials/creating-a-project-from-github/git-fetch/) to discover how to fetch updates.

3. Cloning Errors in IntelliJ (Authentication Failed)

    If you are using an old GitHub access token from the last semester, you may encounter an authentication error during the `git clone` (Get from VCS) process.

    **Solution**: generate a new personal token on GitHub, then on the GitHub authentication dialog in IntelliJ, select the Personal Access Token authorization and use the newly created token

### Java Tips

1. Wrong Class Name Compilation Error

    In Java, the public class name and the file name must be the same.

    **Solution**: rename the class or file to the same name

2. Index out of Bounds Exception

    You are trying to access an array element that does not exist for the given index. 

    **Solution**: check that the index is always in the range of permissible indices of the array you are using. Use debugging if you can't find why the invalid index is calculated

3. Presentation Error/Wrong answer on URI

    The URI checker requires precise output up to the last newline character at the end. 

    **Solution**: check every `print` and `printf` call in your code, check the usage of `%n` or `\n` newline sequences; try to minimize the use of the `print` method