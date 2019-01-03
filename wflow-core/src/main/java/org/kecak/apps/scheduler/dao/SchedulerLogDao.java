package org.kecak.apps.scheduler.dao;


import org.joget.commons.spring.model.AbstractSpringDao;
import org.kecak.apps.scheduler.model.SchedulerLog;

import java.util.List;

public class SchedulerLogDao extends AbstractSpringDao<SchedulerLog> {

	public static final String ENTITY_NAME = "SchedulerLog";
	
	
	public void saveOrUpdate(SchedulerLog schedulerLog) {
		super.saveOrUpdate(ENTITY_NAME, schedulerLog);
	}

	public void delete(SchedulerLog schedulerLog) {
		super.delete(ENTITY_NAME, schedulerLog);
	}
	
	public SchedulerLog getSchedulerLogById(String id) {
		return (SchedulerLog) super.find(ENTITY_NAME, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<SchedulerLog> getSchedulerLogs(String condition, String[] param, String sort, Boolean desc, Integer start, Integer rows) {
        if (condition != null && condition.trim().length() != 0) {
            return (List<SchedulerLog>) super.find(ENTITY_NAME, condition, param, sort, desc, start, rows);
        } else {
            return (List<SchedulerLog>) super.find(ENTITY_NAME, "", new Object[]{}, sort, desc, start, rows);
        }
    }

	public Long count(String condition, Object[] params) {
        return super.count(ENTITY_NAME, condition, params);
    }
}
