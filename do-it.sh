
NAME=$(pbpaste | head -n 1 | cut -c 5- | rev | cut -c 2- | rev)
FILE_NAME="${NAME}.clj"

pbpaste > $FILE_NAME
git add .
git commit -m "Add $FILE_NAME"

