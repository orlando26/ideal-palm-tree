package org.rouge.model;

public class Catalogs {

    public enum RideStatus {
        READY(1),
        STARTED(2),
        FINISHED(3),
        CANCELED(4);
    	
    	private int value;
    	
    	private RideStatus(int value) {
    		this.value = value;
    	}
    	
    	public int getValue() {
    		return value;
    	}
    }

    public enum UserProfile {
        ADMIN(1),
        DRIVER(2);
    	
    	private int value;
    	
    	private UserProfile(int value) {
    		this.value = value;
    	}
    	
    	public int getValue() {
    		return value;
    	}
    }

    public enum UserStatus {
        SUSCRIBED(1),
        UNSUSCRIBED(2);
    	
    	private int value;
    	
    	private UserStatus(int value) {
    		this.value = value;
    	}
    	
    	public int getValue() {
    		return value;
    	}
    }

}
