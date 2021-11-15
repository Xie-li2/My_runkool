package www.xie.dao;

import www.xie.entity.Userimgs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Userimgs)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-18 12:37:58
 */
public interface UserimgsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Userimgs queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Userimgs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userimgs 实例对象
     * @return 对象列表
     */
    List<Userimgs> queryAll(Userimgs userimgs);

    /**
     * 新增数据
     *
     * @param userimgs 实例对象
     * @return 影响行数
     */
    int insert(Userimgs userimgs);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Userimgs> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Userimgs> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Userimgs> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Userimgs> entities);

    /**
     * 修改数据
     *
     * @param userimgs 实例对象
     * @return 影响行数
     */
    int update(Userimgs userimgs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     *
     * @param userid
     * @param offset
     * @param limit
     * @return
     */
    List<Userimgs> queryImgByLimit(@Param("userid")Long userid,@Param("offset")int offset, @Param("limit")int limit);
}