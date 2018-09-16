package cn.com.gome.cloud.gmos.open.service.dao;

import cn.com.gome.cloud.gmos.open.service.domain.PushLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PushLogDao extends ElasticsearchRepository<PushLog, String> {
}
