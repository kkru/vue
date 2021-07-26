//https://vuejs.org/v2/guide/custom-directive.html
//v-focus
Vue.directive('focus' , {
    inserted: function (el) {
        el.focus();
    }
})