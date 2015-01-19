package com.ai.lottery.business.listener;

import com.ai.lottery.business.cache.SystemConfigCache;
//import com.ai.lottery.business.dao.service.TdMLevelDao;
//import com.ai.lottery.business.domain.constants.TTdMSystemConfig;
//import com.ai.lottery.business.domain.entity.TdMLevel;
//import com.ai.lottery.core.dao.Criteria;
//import com.ai.lottery.core.utils.CheckNull;
//import com.ai.lottery.business.dao.service.TdMSystemConfigDao;
//import com.ai.lottery.business.domain.constants.TTdMLevel;
//import com.ai.lottery.business.domain.entity.TdMSystemConfig;
import com.ai.lottery.core.listener.SystemShutdownListener;
import com.ai.lottery.core.listener.SystemStartupListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 初始化系统配置数据
 * @author peiyu
 */
@Service("systemConfigListener")
public class SystemConfigListener implements SystemStartupListener, SystemShutdownListener {

    private static final Logger log = LoggerFactory.getLogger(SystemConfigListener.class);

    private SystemConfigCache cache = SystemConfigCache.me();


/*    @Autowired
    private TdMSystemConfigDao tdMSystemConfigDao;

    @Autowired
    private TdMLevelDao tdMLevelDao;*/

    @Override
    public Map<String, Object> startup() {
        log.debug("开始初始化系统配置数据.....");
   /*     Criteria example = new Criteria();
        example.createConditon().andEqualTo(TTdMSystemConfig.STATE, "0");
        List<TdMSystemConfig> list = this.tdMSystemConfigDao.selectByExample(example);
        if(!CheckNull.isNull(list)) {
            list.forEach(config -> this.cache.addCache(config.getConfigKey(), config.getConfigValue()));
        }

        example.clear();
        example.createConditon().andEqualTo(TTdMLevel.STATE, "0");
        List<TdMLevel> levels = this.tdMLevelDao.selectByExample(example);
        if(!CheckNull.isNull(levels)) {
            levels.forEach(level -> this.userLevelCache.addCache(level.getLevelId(), level));
        }
*/
        log.debug("初始化系统配置数据完成....");
        return null;
    }

    @Override
    public void shutdown() {
        log.debug("开始清理缓存数据....");
        cache.clear();
        log.debug("清理缓存数据完成....");
    }
}
