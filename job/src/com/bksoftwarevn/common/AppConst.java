/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.common;
import com.bksoftwarevn.model.Company;
import com.bksoftwarevn.model.Job;
import com.bksoftwarevn.model.Location;
import com.bksoftwarevn.model.Role;
import com.bksoftwarevn.model.User;
import com.bksoftwarevn.model.Website;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ngo Huy
 */
public class AppConst {
    public static List<Job> JOBS = new ArrayList<>();
    public static int NUM_JOB_CURRENT = 0;
    public static List<Company> COMPANYS = new ArrayList<>();
    public static int NUM_COMPANYS_CURRENT = 0;
    public static List<Location> LOCATIONS = new ArrayList<>();
    public static int NUM_LOCATIONS_CURRENT = 0;
    public static List<User> USERS = new ArrayList<>();
    public static int NUM_USERS_CURRENT = 0;
    public static List<Website> WEBSITES = new ArrayList<>();
    public static int NUM_WEPSITES_CURRENT = 0;
    public static List<Role> ROLES = new ArrayList<>();
    public static int NUM_ROLES_CURRENT = 0;
}

