findRideByUser{
FROM org.rouge.db.Ride 
WHERE rde_driver_id =:driver AND rde_rst_id =:status 
ORDER BY rde_start_date ASC
}