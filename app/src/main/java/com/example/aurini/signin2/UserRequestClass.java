package com.example.aurini.signin2;

import retrofit2.http.Field;

public class UserRequestClass {


    String api_key;
    String subscriber_name;
    String subscriber_msisdn;
    String subscriber_type;
    String designated_date;
    String delivery_channel;
    String dialect;
    String time_slot;
    String subscriber_age;
    String subscriber_occupation;
    String subscriber_education_level;
    String subscriber_blood_group;
    String want_guardian;
    String loc_division;
    String loc_district;
    String loc_upazila;
    String loc_union;
    String loc_village;


    public UserRequestClass(String api_key, String subscriber_name, String subscriber_msisdn, String subscriber_type, String designated_date, String delivery_channel, String dialect, String time_slot, String subscriber_age, String subscriber_occupation, String subscriber_education_level, String subscriber_blood_group, String want_guardian, String loc_division, String loc_district, String loc_upazila, String loc_union, String loc_village) {
        this.api_key = api_key;
        this.subscriber_name = subscriber_name;
        this.subscriber_msisdn = subscriber_msisdn;
        this.subscriber_type = subscriber_type;
        this.designated_date = designated_date;
        this.delivery_channel = delivery_channel;
        this.dialect = dialect;
        this.time_slot = time_slot;
        this.subscriber_age = subscriber_age;
        this.subscriber_occupation = subscriber_occupation;
        this.subscriber_education_level = subscriber_education_level;
        this.subscriber_blood_group = subscriber_blood_group;
        this.want_guardian = want_guardian;
        this.loc_division = loc_division;
        this.loc_district = loc_district;
        this.loc_upazila = loc_upazila;
        this.loc_union = loc_union;
        this.loc_village = loc_village;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getSubscriber_name() {
        return subscriber_name;
    }

    public void setSubscriber_name(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }

    public String getSubscriber_msisdn() {
        return subscriber_msisdn;
    }

    public void setSubscriber_msisdn(String subscriber_msisdn) {
        this.subscriber_msisdn = subscriber_msisdn;
    }

    public String getSubscriber_type() {
        return subscriber_type;
    }

    public void setSubscriber_type(String subscriber_type) {
        this.subscriber_type = subscriber_type;
    }

    public String getDesignated_date() {
        return designated_date;
    }

    public void setDesignated_date(String designated_date) {
        this.designated_date = designated_date;
    }

    public String getDelivery_channel() {
        return delivery_channel;
    }

    public void setDelivery_channel(String delivery_channel) {
        this.delivery_channel = delivery_channel;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }

    public String getSubscriber_age() {
        return subscriber_age;
    }

    public void setSubscriber_age(String subscriber_age) {
        this.subscriber_age = subscriber_age;
    }

    public String getSubscriber_occupation() {
        return subscriber_occupation;
    }

    public void setSubscriber_occupation(String subscriber_occupation) {
        this.subscriber_occupation = subscriber_occupation;
    }

    public String getSubscriber_education_level() {
        return subscriber_education_level;
    }

    public void setSubscriber_education_level(String subscriber_education_level) {
        this.subscriber_education_level = subscriber_education_level;
    }

    public String getSubscriber_blood_group() {
        return subscriber_blood_group;
    }

    public void setSubscriber_blood_group(String subscriber_blood_group) {
        this.subscriber_blood_group = subscriber_blood_group;
    }

    public String getWant_guardian() {
        return want_guardian;
    }

    public void setWant_guardian(String want_guardian) {
        this.want_guardian = want_guardian;
    }

    public String getLoc_division() {
        return loc_division;
    }

    public void setLoc_division(String loc_division) {
        this.loc_division = loc_division;
    }

    public String getLoc_district() {
        return loc_district;
    }

    public void setLoc_district(String loc_district) {
        this.loc_district = loc_district;
    }

    public String getLoc_upazila() {
        return loc_upazila;
    }

    public void setLoc_upazila(String loc_upazila) {
        this.loc_upazila = loc_upazila;
    }

    public String getLoc_union() {
        return loc_union;
    }

    public void setLoc_union(String loc_union) {
        this.loc_union = loc_union;
    }

    public String getLoc_village() {
        return loc_village;
    }

    public void setLoc_village(String loc_village) {
        this.loc_village = loc_village;
    }
}
