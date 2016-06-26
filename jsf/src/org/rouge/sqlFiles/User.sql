findByUserName{
FROM org.rouge.db.User where usr_username = :user
}

findByPrimaryKey{
FROM org.rouge.db.User where usr_id = :id
}

findAll{
FROM org.rouge.db.User 
}

deleteById{
delete FROM org.rouge.db.User where usr_id = :id
}
