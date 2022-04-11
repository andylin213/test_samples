#include <iostream>
#include <sstream>
#include <map>
#include "MySQLConnection.h"

std::string source() {
    return "";
}

void sink(std::string x) {

}

std::string spread(std::string x) {
    return "";
}

void ignore() {
    auto a = source();
    sink(a);
}

void test(std::string x) {
    sink(x);
}

Json::Value XXX::handle(const Json::Value& request) const
{
    std::string sql = request["sql"];
    MySQL::Connection connServices(connStr);
    connServices.execute();

    auto a = source();
    auto aa = spread(a);
    sink(aa);

    ignore();

    test("x");
}
