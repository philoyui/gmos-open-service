package cn.philoyui.open.service.dao;

import cn.philoyui.open.service.domain.PushLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PushLogDao extends ElasticsearchRepository<PushLog, String> {
}
