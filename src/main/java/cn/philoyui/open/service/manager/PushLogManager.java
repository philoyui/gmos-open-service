package cn.philoyui.open.service.manager;

import cn.philoyui.open.service.dao.PushLogDao;
import cn.philoyui.open.service.domain.PushLog;
import org.springframework.stereotype.Component;

@Component
public class PushLogManager {

    private PushLogDao pushLogDao;



    public void insert(PushLog pushLog) {
        pushLogDao.save(pushLog);
    }


    public PushLog get(String id) {
        return pushLogDao.findOne(id);
    }

    public void update(PushLog pushLog) {
        pushLogDao.save(pushLog);
    }
}
