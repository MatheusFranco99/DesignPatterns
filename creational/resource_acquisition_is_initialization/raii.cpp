#include <iostream>
#include <fstream>
#include <memory>

class File {
public:
    File(const char* filename) : file_(std::make_unique<std::ifstream>(filename)) {
        if (!file_->is_open()) {
            throw std::runtime_error("Failed to open file");
        }
    }

    ~File() {
        if (file_->is_open()) {
            file_->close();
        }
    }

    std::string readLine() {
        std::string line;
        std::getline(*file_, line);
        return line;
    }

private:
    std::unique_ptr<std::ifstream> file_;
};

int main() {
    try {
        File file("example.txt");
        std::string line = file.readLine();
        std::cout << line << std::endl;
    } catch (const std::exception& e) {
        std::cerr << e.what() << std::endl;
    }
    return 0;
}
