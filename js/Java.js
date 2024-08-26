var offset = 300;
var duration = 750;
                $(function () {
                    $(window).scroll(function () {
                        if ($(this).scrollTop() > offset) 
                            $('#top-up').fadeIn(duration);
                         else 
                            $('#top-up').fadeOut(duration);                      
                    });
                    $('#top-up').click(function () {
                        $('body,html').animate({
                            scrollTop: 0
                        }, duration);
                    });
                });
$(document).ready(function(){
    $('#eye').click(function(){
        $(this).toggleClass('open');
        $(this).children('i').toggleClass('fa-eye-slash fa-eye');
        if($(this).hasClass('open')){
            $(this).prev().attr('type','text');
        }else{
            $(this).prev().attr('type','password');
        }
    });
});
const addressbtn = document.querySelector('#motaikhoan')
addressbtn.addEventListener("click",function(){
    document.querySelector('.taikhoan').style.display="flex"
});

const addressclose = document.querySelector('#dongtaikhoan')
addressclose.addEventListener("click",function(){
    document.querySelector('.taikhoan').style.display="none"
});
/*function init() {
    let im = document.getElementById("mainIm");
    let images = document.querySelectorAll(".thum img");
    for (let i = 0; i < images.length; i++)
        images[i].addEventListener("click", function() {
            im.src = this.src;
        })
}*/
const nut = document.querySelectorAll("button")
nut.forEach(function(button,index){
   button.addEventListener("click",function(event){{
    var nutItem = event.target
    var product = nutItem.parentElement
    var productImg = product.querySelector("img").src
    var productTen = product.querySelector("h4").innerText 
    var productGia = product.querySelector(".sp span").innerText
    addcart(productImg,productTen,productGia)
   }})
})
function addcart(productImg,productTen,productGia) {
    var addtr = document.createElement("tr")
    var cartItem = document.querySelectorAll("tbody tr")
    for(var i=0; i<cartItem.length;i++){
        var productT = document.querySelectorAll(".title span")
        if (productT[i].innerHTML==productTen){
            alert("Sản phảm bạn chọn đã có trong giỏ hàng")
            return
        }
    }
    var trcontent = ' <tr><td class="flex" ><img src="'+productImg+'" alt=""><span class="title"><span class="title">'+productTen+'</span></span></td><td><span class="gia">'+productGia+'</span><sup>đ</sup></td><td><input type="number" value="1" min="0"></td><td><span class="cart-delete">Xóa</span></td></tr>'
    addtr.innerHTML = trcontent
    var cartTable = document.querySelector("tbody")
    cartTable.append(addtr)
    carttotal()
    deleteCard()
}
function carttotal (){
    var cartItem = document.querySelectorAll("tbody tr")
    var totalB = 0
    for (var i=0; i<cartItem.length;i++){
        var inputValue = cartItem[i].querySelector("input").value
        var productGia = cartItem[i].querySelector(".gia").innerHTML
        totalA = inputValue*productGia*1000
       totalB = totalB + totalA
    }
    var cartTotoalS = document.querySelector(".tongtien span")
    cartTotoalS.innerHTML = totalB.toLocaleString('de-DE')
    var cartTotoalgh = document.querySelector(".mogiohang span")
    cartTotoalgh.innerHTML = totalB.toLocaleString('de-DE')
    inputChange ()
}
function deleteCard(){
    var cartItem = document.querySelectorAll("tbody tr")
    for (var i=0; i<cartItem.length;i++){
        var productT = document.querySelectorAll(".cart-delete")
        productT[i].addEventListener("click",function(event){
            var cartDelete = event.target
            var cartitemR = cartDelete.parentElement.parentElement
            cartitemR.remove()
            carttotal ()
        })
    }
}
function inputChange () {
    var cartItem = document.querySelectorAll("tbody tr")
    for (var i=0; i<cartItem.length;i++){
        var inputValue = cartItem[i].querySelector("input")
        inputValue.addEventListener("change",function(){
            carttotal ()
        })
    }
}
const ghbtn = document.querySelector("#donggiohang")
const ghshow = document.querySelector("#mogiohang")
ghshow.addEventListener("click",function(){
    document.querySelector(".cart").style.left= "0"
})
ghbtn.addEventListener("click",function(){
    document.querySelector('.cart').style.left="-100%"
})
window.onscroll = function() {
    var header = document.getElementById("myHeader");
    if (document.documentElement.scrollTop > 100 || document.body.scrollTop > 100) {
        header.style.position = "fixed";
        header.style.zIndex = 9;
        header.style.top = 0;
    }
    else {
        header.style.position = "relative";
    }
}
const rightbtn = document.querySelector('.fa-chevron-right')
const leftbtn = document.querySelector('.fa-chevron-left')
const imgNumber = document.querySelectorAll('.subnext')
let index = 0
rightbtn.addEventListener("click",function(){
    index = index+1
    if(index>imgNumber.length-1){
        index=0;
    }
    document.querySelector(".nextimg").style.right = index *100+"%"
})
leftbtn.addEventListener("click",function(){
    index = index-1
    if(index<0){
        index=imgNumber.length-1
    }
    document.querySelector(".nextimg").style.right = index *100+"%"
})
console.log(imgNumber)



function init(){
    var images=document.querySelectorAll("div.thumb img")
    for(var i=0; i<images.length; i++)
        images[i].onclick=function(){
            var path=this.src
            var img=document.getElementById("mainImg")
            img.setAttribute("src",path)
        }
}

$('input.input-qty').each(function() {
  var $this = $(this),
    qty = $this.parent().find('.is-form'),
    min = Number($this.attr('min')),
    max = Number($this.attr('max'))
  if (min == 0) {
    var d = 0
  } else d = min
  $(qty).on('click', function() {
    if ($(this).hasClass('minus')) {
      if (d > min) d += -1
    } else if ($(this).hasClass('plus')) {
      var x = Number($this.val()) + 1
      if (x <= max) d += 1
    }
    $this.attr('value', d).val(d)
  })
});

const addBox = document.querySelectorAll("button")
addBox.forEach(function(button,index){
   button.addEventListener("click",function(event){{
    var nutItem = event.target
    var product = nutItem.parentElement
    var productImg = product.querySelector(".item img").src
    var productTen = product.querySelector("h1").innerText 
    var productGia = product.querySelector("h2 > span").innerText
    addcart(productImg,productTen,productGia)
   }})
})