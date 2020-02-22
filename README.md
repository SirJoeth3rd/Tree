# Tree
A Tree like data structure

(this mose likely already exists)
Exactly what is says on the box I plan on using this data structure and thought it good to share it
It allows you to store data in a system where you can move vertically and horizontally
What I mean by that is that each data point is connected to a Node that has connections to Nodes
next to it and nodes beneath it.

# Initialize
Initialize the tree with your data type
eg. Tree<int> tree = new Tree<int>();
When a tree is initialized it will generate the first Node (AKA the anchor Node) with no other connections

# isEmpty()
returns true if the Tree has no keys and only the anchor node 

# addBranch(Object)
Adds a node ,with passed Object as it's key, beneath the current Node transforming it into a branch and moves to it setting it as the current Node with the initial Node as the parent Node.

# addLeaf(Object)
Adds a node ,with Object passed as it's key, next to current Node and moves to it setting it as the current Node with the initial Node as the previous Node;

# returnKey()
Returns the key of the current Node

# setKey(Object)
Set's key of current Node to passed Object

# removeNext()
Removes the next Node down the tree list,if the next Node has a next Node itself that Node will simply be the new next Node of the current Node

# removeAllNext()
Removes the next Node and all the Nodes after it in the brach and all their branches 

# removePrevious()
Removes the previous Node it their is one otherwise it does nothing,I find this preferable to printing an error message.

# removeBranch()
Removes the Branch of the current Node if any exists.

# moveToBranchAnchor()
Sets current Node to Node at beggining of current branch

# moveToAnchor()
Sets current Node to Node at beggining of topmost branch

# moveNext(),movePrevious(),moveUp(),moveDown()
Sets current node to next Node,previous Node,parent Node,first Node in branch respectively

# boolean canMoveNext(),canMovePrevious(),canMoveUp(),canMoveDown()
returns boolean set to True if next,previous,parent,first branch node exists respectively False otherwise

ps : this hasn't been tested I only plan on using this and have not used it yet however this might change in the near future but it might not depending on whether I use it or not therefore if it does not behave as expected consider it a fun challenge to fix it and let me know.
