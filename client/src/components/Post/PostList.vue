<template>
<div>
  <PostCreate/>
  <PostUpdate/>
</div>
</template>

<script>
import PostCreate from "@/components/Post/PostCreate";
import PostUpdate from "@/components/Post/PostUpdate";
export default {
  name: "PostList",
  components: {PostUpdate, PostCreate}
}
</script>

<style scoped>

</style>