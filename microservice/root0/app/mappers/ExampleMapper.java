package mappers;

import org.apache.ibatis.annotations.Param;

/**
 * ExampleMapper . Created at 8/31/2018 2:30 PM by @author Timur Isachenko
 * @isatimur | † be patient and test it! †
 */
public interface ExampleMapper {
    Object selectObject(
            @Param("someField") int someField,
            @Param("secondField") String secondField);

    void updateObject(Object o);
}
