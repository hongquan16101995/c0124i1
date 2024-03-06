package bai4;

public class AnimalManage {
    // kdl[] <tên> = new kdl[số lượng phần tử];
    Animal[] animals = new Animal[5];
    // kdl: nguyên thủy và tham chiếu (object)
    // tất cả các lớp được tạo trong chuơng trình Java đều được coi là 1 kiểu dữ liệu

    // các phương thức để thao tác với đối tượng Animal
    // thêm, sửa, xóa, hiển thị, tìm kiếm, sắp xếp,...
    Animal animal1 = new Animal("dog", 2, 2);
    Animal animal2 = new Animal("cat", 1, 1);
    public void add() {
        animals[0] = animal1;
        animals[1] = animal2;
    }
}
