# we-school-services
we-school-services





###Install Mysql

> brew install mysql
> brew services start mysql

###Install Mongo DB

Mac

Install brew from [brew.sh](brew)
Install mongo from https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-os-x/

To run MongoDB (i.e. the mongod process) as a macOS service, run:

> brew services start mongodb-community@8.0

To stop a mongod running as a macOS service, use the following command as needed:

> brew services stop mongodb-community@8.0

OR

> mongod --config /opt/homebrew/etc/mongod.conf --fork


to go to mongo terminal run
> mongosh
