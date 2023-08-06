#Basic Git Commands

**Lists branch** `git branch`

**Create new branch** `git branch <branch-name>`

**Switch branch** `git checkout <branch-name>, git switch <branch-name>`

**Logs** `git log`
**To print a single commit in a single line as output** `git log --oneline`

**Add all changes to git and commit them at once** `git commit -a-m "some messages"`

**Create a new branch and switch to it** `git checkout -b <branch-name>`

**Delete a branch** `git branch -d <branch-name>`

**Force delete a branch** `git branch -D <branch-name>`

**Rename branch** `git branch -m <new-renamed-branch-name>`

**Merging branch with fast-forward** `git merge <branch-name>`

**Merging branch withOUT fast-forward** `git merge --no-ff <branch-name>`

**Git Stash : Saves the changes that you are not ready to commit** `git stash` or `git stash save`

**Pops the most recent one from your stash** `git stash pop`

**Applies the most recent one from your stash without removing it from your stash** `git stash apply`

**View all stashes** `git stash list`

**If you have multiple things in your stash and want to apply particular one** `git stash apply stash@{<stash-id>}`

**Delete a particular stash** `git stash drop stash@{<stash-id>}`

**Clear all stashes** `git stash clear`

**Download changes from a remote repository, BUT those changes will not be integrated into our working directory** `git fetch <branch-name` OR `git fetch`

**Download changes from a remote repository, AND immediately update our working directory with those changes.** _Git pull = git fetch + git merge_ `git pull <branch-name` OR `git pull`

## Some Advanced commands:

**Checkout previous commit** `git checkout commit <commit-hash>`

**Checkout one commit before** `git checkout HEAD~1`

**Checkout two commits before** `git checkout HEAD~2`

_With above 3 commands, detached HEAD is created so to switch back to your working branch use `git checkout <branch>` or `git switch -`_

**Print a list of all tags in a current repository** `git tag` or `git tag -l` or `git tag -l "<search-term>"` eg. `git tag -l "*v17*"`

**Creating lightweight tag** `git tag v1.0.5`

**Diff between tags** `git diff v1.0.4..v1.0.5`

**Creating annotated tags** `git tag -a v1.0.5`


###### Case1:

Suppose, you have made some uncommitted changes to a file but don't want to keep them anymore. You have these options, 
Either you could manually open the file and revert the additional lines of code OR:
`git checkout HEAD <filename.txt>` OR `git checkout -- <filename1.txt> <filename2.txt>` OR `git restore <filename.txt>`
This will erase all the uncommitted changes from a file(s) and fetches contents from its latest committed state.


###### Case2:
If you have accidentally added a file to your staging area, with _git add_ and you dont wish to include it in the 
next commit, you can use:
`git restore --staged <filename.txt>`


###### Case3:
Suppose you have made few commits on your branch, but you realized that those commits aren't needed anymore.
To undo those commits you can use following command. Pick a commit-hash that you were planning to switch to. This command will 
remove the commit but will **KEEP** the changes in your working directory.
`git reset <commit-hash>`

Again, if you want to undo both the commits **AND** the actual changes in your files, you can use the **--hard** option.
`git rest --hard HEAD~1` will delete the last commit and associated changes.

