let demo = {

    id: 34,
    title: "books",
    price: 200,

    printOrder: function () {
        console.log("Oder is: ");
        console.log("id = ", this.id);
        console.log("Title = ", this.title);
        console.log("price = ", this.price);

    },
    getPrice: function () {
        return this.price;
    }

};

let new_obj = Object.assign({}, demo);
console.log(new_obj);
new_obj.printOrder();
demo.printOrder();
