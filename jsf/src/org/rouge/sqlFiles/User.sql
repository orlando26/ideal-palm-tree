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

updateById{
update org.rouge.db.User
set usr_name = :name, usr_usp_id = :profile, usr_email = :email, usr_username = :username,
    usr_pwd = :password, usr_phone = :phone, usr_boss_id = :boss, usr_ust_id=:status,
    usr_active=:active
where usr_id= :id
}
