package InMemoryModel;

// интерфейс смены модели
public interface IModelChanger {
    public void notifyChange (IModelChanger sender);
}
