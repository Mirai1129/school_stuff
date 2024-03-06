if __name__ == '__main__':
    Nina = "抱枕"
    Sam = "娃娃"
    print(f"Nina 拿著<{Nina}>, Sam 拿著<{Sam}>")
    table = Nina
    Nina = Sam
    Sam = table
    print(f"Nina 拿著<{Nina}>, Sam 拿著<{Sam}>")
