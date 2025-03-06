package Ejercicio5;

public interface IOadRead {
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);
    Object[] GetAll();
    Object GetById(Object id);
}
