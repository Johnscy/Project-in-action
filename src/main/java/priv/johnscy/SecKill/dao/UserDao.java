package priv.johnscy.SecKill.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import priv.johnscy.SecKill.domain.User;

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getById(@Param("id") int id);
}
