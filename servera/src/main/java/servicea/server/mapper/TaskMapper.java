package servicea.server.mapper;

import java.util.List;


/**
 * @author tanghuan
 */
public interface TaskMapper {


    /**
     * 获取所有任务列表
     *
     * @return 任务列表
     */
    List<String> listAll();
}
