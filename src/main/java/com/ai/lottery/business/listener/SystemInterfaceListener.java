package com.ai.lottery.business.listener;

import com.ai.lottery.business.cache.StrategyCache;
//import com.ai.lottery.business.cache.SystemInterfaceCache;
//import com.ai.lottery.business.dao.service.TdMSystemInterfaceDao;
//import com.ai.lottery.business.domain.constants.TTdMSystemInterface;
//import com.ai.lottery.business.domain.entity.TdMSystemInterface;
import com.ai.lottery.core.controller.strategy.Strategy;
import com.ai.lottery.core.controller.strategy.impl.AESStrategyImpl;
import com.ai.lottery.core.controller.strategy.impl.NullStrategyImpl;
import com.ai.lottery.core.dao.Criteria;
import com.ai.lottery.core.listener.SystemShutdownListener;
import com.ai.lottery.core.listener.SystemStartupListener;
import com.ai.lottery.core.utils.CheckNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 初始化系统接口配置
 * @author peiyu
 */
@Service("systemInterfaceListener")
public class SystemInterfaceListener implements SystemStartupListener, SystemShutdownListener {

    private static final Logger log = LoggerFactory.getLogger(SystemInterfaceListener.class);

//    private SystemInterfaceCache cache = SystemInterfaceCache.me();

    private StrategyCache strategyCache = StrategyCache.me();

/*    @Autowired
    private TdMSystemInterfaceDao tdMSystemInterfaceDao;*/

    @Override
    public void shutdown() {
        log.debug("清理系统接口配置数据缓存.....");
//        this.cache.clear();
    }

    @Override
    public Map<String, Object> startup() {
        log.debug("开始初始化系统接口配置数据.....");
       /* Criteria example = new Criteria();
        example.createConditon().andEqualTo(TTdMSystemInterface.STATE, "0");
        List<TdMSystemInterface> list = this.tdMSystemInterfaceDao.selectByExample(example);
        if(!CheckNull.isNull(list)) {
            list.forEach(face -> this.cache.addCache(face.getInterfaceCode(), face));
        }

        Strategy strategy1 = new NullStrategyImpl();
        Strategy strategy2 = new AESStrategyImpl();
        this.strategyCache.addCache(0, strategy1);
        this.strategyCache.addCache(1, strategy2);*/


        log.debug("初始化系统接口配置数据完成.....");
        return null;
    }
}
