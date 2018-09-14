package cn.com.gome.cloud.gmos.open.service;

import cn.com.gome.cloud.gmos.open.service.domain.MessageTopic;
import cn.com.gome.cloud.gmos.open.service.domain.TopicCategory;
import cn.com.gome.cloud.gmos.open.service.domain.TopicField;
import cn.com.gome.cloud.gmos.open.service.service.AppTopicRelationService;
import cn.com.gome.cloud.gmos.open.service.service.MessageTopicService;

import java.util.List;

public class UnitTest {


    private MessageTopicService messageTopicService = new MessageTopicService();

    private AppTopicRelationService appTopicRelationService = new AppTopicRelationService();

    /**
     * 展示所有的主题类型
     */
    public void test_list_all_topic_type(){

        List<TopicCategory> topicCategoryList = messageTopicService.findTypeByPlatformId("");

    }

    /**
     * 根据分类，展示所有可订阅的Topic
     */
    public void test_list_all_subscribe_topic(){

        List<MessageTopic> messageTopics = messageTopicService.findByCategoryId("");

    }

    /**
     * 详细展示消息主题
     */
    public void test_detail_topic(){

        MessageTopic messageTopic = messageTopicService.get("");

        List<TopicField> topicFieldList  = messageTopicService.findFieldsByTopicId(messageTopic.getId());

    }

    /**
     * 订阅Topic，发送事件
     */
    public void test_subscribe_topic(){

        String appId = "";
        String topicId = "";

        appTopicRelationService.subscribeTopic(appId,topicId);
    }

    /**
     * 订阅Topic，发送事件
     */
    public void test_cancel_subscribe_topic(){

        String appId = "";
        String topicId = "";

        appTopicRelationService.cancelSubscribe(appId,topicId);
    }

    public void test_list_subscribe_relation(){
        String appId = "";
        appTopicRelationService.findByApp(appId);
    }

}
