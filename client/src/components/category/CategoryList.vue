<template>
 <div>
   <div>this is category list</div>

   <CategoryCreate/>

   <CategoryUpdate/>
 </div>
</template>

<script>
import CategoryCreate from "@/components/category/CategoryCreate";
import CategoryUpdate from "@/components/category/CategoryUpdate";
export default {
  name: "CategoryList",
  components: {CategoryUpdate, CategoryCreate}
}
</script>

<style scoped>

</style>